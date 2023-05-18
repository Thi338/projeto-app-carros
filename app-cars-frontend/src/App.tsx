
import { BrowserRouter as Router, Routes, Route } from 'react-router-dom';


import CadastroCarros from './components/Carros/CadastroCarros';
import { CadastroClientes } from './components/Clientes/CadastroClientes';
import { CadastroVistorias } from './components/Vistorias/CadastroVistorias';
import { Login } from './components/Login/Login';

function App() {

  return (
   
    <Router>
        <Routes>
            <Route path='/' element={<CadastroCarros />}/>
            <Route path='/clientes' element={<CadastroClientes />}/>
            <Route path='/vistorias' element={<CadastroVistorias />}/>
            <Route path='/login' element={<Login />}/>
        </Routes>
    </Router>
          
  )
  
}

export default App
