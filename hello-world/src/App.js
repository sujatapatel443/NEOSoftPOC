import logo from './logo.svg';
import './App.css';
import Greet from './components/Greet'
import Welcome from './components/Welcome'
import HelloJSX from './components/HelloJSX'
import Message from './components/Message'

function App() {
  return (
    <div className="App">
    {/* <Greet/>*/}

    <Greet  name = "Sujata" heroname = "Developer">
      <p>This is children props</p> </Greet>
    <Greet name = "Raj" heroname = "Developer">
      <botton>Action</botton>
    </Greet>
    <Greet name = "Anusha" heroname = "Student"/>

      <Welcome name = "Sujata" heroname = "Developer"/>
      <Welcome  name = "Raj" heroname = "Developer"/>
      <Welcome name = "Anusha" heroname = "Student"/>
      <Message/>

     

      {/*<HelloJSX/>*/}
     
    </div>
  )
}

export default App
