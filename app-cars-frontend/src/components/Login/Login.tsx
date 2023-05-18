import { useEffect, useState, useContext } from "react";
import { firebase, auth } from "../../services/firebase";
import { AuthContext } from "../../context/AuthContext";
import { Link } from "react-router-dom";

export function Login() {
    
    const { user, setUser} = useContext(AuthContext);
    console.log(user);
    

    useEffect(() => {
        auth.onAuthStateChanged(user => {
            if (user) {
                const { uid, displayName, photoURL } = user;

                if (!displayName || !photoURL) 
                    throw new Error("O usuário não tem displayName ou photoURL")
            
                setUser({
                    id: uid,
                    avatar: photoURL,
                    name: displayName,
                });
            }
        })
    }, []);

    const handleClickButtonLogin = async () => {

        const provider = new firebase.auth.GoogleAuthProvider();

        const result = await auth.signInWithPopup(provider);
        if (result.user) {
            const { uid, displayName, photoURL } = result.user;

            if (!displayName || !photoURL) 
                throw new Error("O usuário não tem displayName ou photoURL")
        
            setUser({
                id: uid,
                avatar: photoURL,
                name: displayName,
            });
        }
        
    };

    return (
        <div id="login">
            <h1>Tela de Login</h1>
            <main>
                
            </main>
        </div>
    );
}