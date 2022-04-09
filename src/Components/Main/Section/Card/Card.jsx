import './Card.css'

// eslint-disable-next-line import/no-anonymous-default-export
export default (props) => {
    return (
        <div className="card">
            <img src={props.foto} alt="Cards de Fotos" />
           
        </div>
        
    );
}