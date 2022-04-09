import './Section.css'
import Card from "./Card/Card";
import fotospaisagem from '../../../assets/img/jardimBotanico.jpg';
import fotosdoslugares from '../../../assets/img/moscou.jpg';



// eslint-disable-next-line import/no-anonymous-default-export
export default () => {
    return (
        <section className="divCards container-fluid">
            <Card foto={fotospaisagem}></Card>            
            <Card foto={fotosdoslugares}></Card>
            
           
            
        </section>
    );
}