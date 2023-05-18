import firebase from "firebase/app";
import 'firebase/auth';

const firebaseConfig = {
    apiKey: "AIzaSyC3DEt-M0uachYZ_nYYKEwj9YYaSMVKAwA",
    authDomain: "helpdesk-b7437.firebaseapp.com",
    projectId: "helpdesk-b7437",
    storageBucket: "helpdesk-b7437.appspot.com",
    messagingSenderId: "428453817030",
    appId: "1:428453817030:web:ddeebec1ad9e86288fc5c7",
    measurementId: "G-SLE8TV4210"
  };

  const app = firebase.initializeApp(firebaseConfig);
  const auth = firebase.auth();

  export { firebase, auth, app}