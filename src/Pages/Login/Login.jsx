import FormLogin from "../../Components/FormLogin/FormLogin";
import Navbar from "../../Components/Navbar/Navbar";
import './Login.css'

// eslint-disable-next-line import/no-anonymous-default-export
export default () => {
    return(
        <>
            <Navbar></Navbar>
            <FormLogin></FormLogin>
        </>
    );
}