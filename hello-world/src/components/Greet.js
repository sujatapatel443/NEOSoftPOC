import React from 'react'

/*functional component
 */

//function Greet(){
 //   return <h1>Hello Sujata</h1>
//}

/** functional components by ES6 arrow functon 
*/

//const Greet = () => <h1>Hello Sujata Patel</h1>

/**named export */
/*export const Greet = () => <h1>Hello Sujata Patel</h1>*/

/**Properties props in react */

const Greet = (props) =>{
    console.log(props)
    return (
        <div>
            <h1>Hello {props.name} a.k.a {props.heroname}</h1>
        
        {props.children}
        </div>

    ) 
}

/**defaut export 
*/

export default Greet
