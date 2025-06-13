import logo from './logo.svg';
import './App.css';
import Form from'./Forms.js';
import Sviet from'./Sviet.js';
function App() {
  return (
    <div className="App">
      <header className="">
        <img src ="https://tse4.mm.bing.net/th?id=OIP.JYcXOWXa2DiEF_fGMwx25gHaHa&pid=Api&P=0&h=180" className="App-logo" alt="logo" />
        <p>
           Sri vasavi institue of engineering and technology
        </p>
        <a
          className="App-link"
          href="https://reactjs.org"
          target="_blank"
          rel="noopener noreferrer"
        >
          sviet website
        </a>
        <Form/>
        <Sviet title ="Empowering Minds"/>
        </header>
    </div>
  );
}

export default App;
