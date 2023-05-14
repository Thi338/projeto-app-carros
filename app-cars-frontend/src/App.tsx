
import { useState } from 'react';
import './App.css'
import { Card } from './components/Card/card';
import { useCarData } from './hooks/useCarData';
import { CreateModal } from './components/create-modal/create-modal';


function App() {
  const { data } = useCarData();
  const [isModalOpen, setIsModalOpen] = useState(false);


  const handleOpenModal = () => {
    setIsModalOpen(prev => !prev)
  }
  return (
      <div className='container'>
        <h1>Cadastro de Carros</h1>
        <div className="card-grid">
            {data?.map(carData => <Card 
            price={carData.price} 
            model={carData.model}
            image={carData.image}
            year={carData.year}
            color={carData.color}
            numberOfPorts={carData.numberOfPorts}
            />
            )}
        </div>
        {isModalOpen && <CreateModal closeModal={handleOpenModal} />}
        <button onClick={handleOpenModal}>novo</button>
      </div>
  )
}

export default App
