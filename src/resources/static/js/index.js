const listaMediciCardiologie  = ["Badea Ioan", "Popescu Grigore", "Chelaru Mircea", "Macedon Alexandru", "Badea Cristian"];
const listaMediciDermatologie = ["Popescu Elena"];
const listaMediciPediatrie    = ["Radu Maria", "Popa Ion", "Ionescu Alina"];
const listaMediciNeurologie   = ["Georgescu Ioana", "Constantin Andrei", "Radulescu Ana", "Vasilescu Alexandru"];
const listaMediciOftalmologie = ["Petrescu Mihai", "Dumitrescu Andreea", "Voinea Radu", "Stancu Ion"];
const listaMediciGinecologie  = ["Muresan Alina", "Popa Ioana", "Diaconu Maria", "Nicolescu Carmen"];
const listaMediciUrologie     = ["Popescu Mihai", "Ionescu Andrei", "Radulescu Catalin", "Constantinescu Dan"];

const listaSpecializari = {
    "Cardiologie": listaMediciCardiologie,
    "Dermatologie": listaMediciDermatologie,
    "Pediatrie": listaMediciPediatrie,
    "Neurologie": listaMediciNeurologie,
    "Oftalmologie": listaMediciOftalmologie,
    "Ginecologie": listaMediciGinecologie,
    "Urologie": listaMediciUrologie
};

window.addEventListener("load", function() {
    populareDropdownSpecializari();
    document.getElementById("select-specializare").addEventListener("change", populareDropdownMedici, false);
    document.getElementById("formProgramareNoua").addEventListener("submit", validareForm, false);
});

function populareDropdownSpecializari(){
    let select_specializare = document.getElementById("select-specializare");
    for(let specializare in listaSpecializari) {
        let element_option = document.createElement("option");
        element_option.textContent = specializare;
        element_option.value = specializare;
        select_specializare.appendChild(element_option);
    }
}

function populareDropdownMedici(){
    let select_medic = document.getElementById("select-medic");
    for(let i = select_medic.options.length-1; i >= 0; i--) {
        select_medic.remove(i);
    }
    let select_specializare = document.getElementById("select-specializare");
    let specializareSelectata = select_specializare.options[select_specializare.selectedIndex].text;
    let listaMediciSpecializare = listaSpecializari[specializareSelectata];
    for(let i = 0; i < listaMediciSpecializare.length; i++) {
        let opt = listaMediciSpecializare[i];
        let el = document.createElement("option");
        el.textContent = opt;
        el.value = opt;
        select_medic.appendChild(el);
    }
}

function validareForm(event){
    event.preventDefault();
    validareNume();
    validarePrenume();
    validareVarsta();
    validareTelefon();
    validareCNP();
    validareEmail();
    validareSpecializare();
    validareData();
}

function setareEroare(input, mesajEroare){
    let divInfo = input.parentElement;
    divInfo.className = 'div-info eroare';
    let p = divInfo.querySelector('p');
    p.innerHTML = mesajEroare;
    let i = divInfo.querySelector('i');
    i.className = 'fa-solid fa-x';
}
function setareEroareDropDown(input, mesajEroare){
    let divInfo = input.parentElement;
    divInfo.className = 'div-info eroareDDL';
    let p = divInfo.querySelector('p');
    p.innerHTML = mesajEroare;
    let i = divInfo.querySelector('i');
    i.className = 'fa-solid fa-x';
}
function setareSucces(input){
    let divInfo = input.parentElement;
    divInfo.className = 'div-info succes';
    let i = divInfo.querySelector('i');
    i.className = 'fa-solid fa-check';
}


function validareNume(){
    let nume      = document.getElementById("nume");
    let numeValue = nume.value.trim();
    if(esteGol(numeValue)) {
        setareEroare(nume, "Completează numele");
        return;
    }
    if(marimeNevalida(numeValue)){
        setareEroare(nume, "Mărime nume nevalidă");
        return;
    }
    if(! esteValidFormatNume(numeValue)){
        setareEroare(nume, "Format nepermis.");
        return;
    }
    setareSucces(nume);
}

function validarePrenume() {
    let prenume       = document.getElementById("prenume");
    let prenumeValue  = prenume.value.trim();
    if (esteGol(prenumeValue)){
        setareEroare(prenume, "Completează prenumele");
        return;
    }
    if (!esteValidFormatNume(prenumeValue)){
        setareEroare(prenume, "Format nepermis.");
        return;
    }
    if (marimeNevalida(prenumeValue)){
        setareEroare(prenume, "Mărime prenume nevalidă");
        return;
    }
    setareSucces(prenume);
}

function validareVarsta(){
    let varsta      = document.getElementById("varsta");
    let varstaValue = varsta.value.trim();
    if(esteGol(varstaValue)){
        setareEroare(varsta, "Completează vârsta");
        return;
    }
    if(! esteValidFormatVarsta(varstaValue)){
        setareEroare(varsta, "Vârstă nevalidă");
        return;
    }
    if(varstaValue < 0 || varstaValue > 120){
        setareEroare(varsta, "Vârstă nevalidă");
        return;
    }
    setareSucces(varsta);
}

function validareTelefon(){
    let nrtelefon      = document.getElementById("nrtelefon");
    let nrtelefonValue = nrtelefon.value.trim();
    if(esteGol(nrtelefonValue)) {
        setareEroare(nrtelefon, "Completează nr de telefon");
        return;
    }
    if(! esteValidFormatTelefon(nrtelefonValue)){
        setareEroare(nrtelefon, "Format nr de telefon nevalid");
        return;
    }
    if(nrtelefonValue.length < 4 || nrtelefonValue.length > 20){
        setareEroare(nrtelefon, "Mărime nr telefon nevalidă");
        return;
    }
    setareSucces(nrtelefon);
}

function validareCNP(){
    let cnp      = document.getElementById("cnp");
    let cnpValue = cnp.value.trim();
    if(! contineDoarCifre(cnpValue)){
        setareEroare(cnp, "CNP-ul este format doar din cifre");
        return;
    }
    if(cnpValue.length != 13){
        setareEroare(cnp, "CNP-ul este format din 13 cifre");
        return;
    }
    setareSucces(cnp);
}

function validareEmail(){
    let email      = document.getElementById("email");
    let emailValue = email.value.trim();
    if(esteGol(emailValue)){
        setareEroare(email, "Completează email-ul");
        return;
    }
    if(! esteValidFormatEmail(emailValue)){
        setareEroare(email, "Format email nevalid");
        return;
    }
    setareSucces(email);
}

function validareSpecializare(){
    let specializare      = document.getElementById("select-specializare");
    let specializareValue = specializare.selectedIndex;
    let medic             = document.getElementById("select-medic");
    if(specializareValue == '0'){
        setareEroareDropDown(specializare, "Selectează o specializare și un medic");
        setareEroareDropDown(medic, "Selectează o specializare și un medic");
        return;
    }
    setareSucces(specializare);
    setareSucces(medic);
}

function validareData(){
    let data       = document.getElementById("data_programare");
    let dataValue  = data.value.trim();
    if(esteGol(dataValue)){
        setareEroare(data, "Selectează o dată");
        return;
    }
    let date = new Date();
    const inputDate = new Date(dataValue);
    if(inputDate < date){
        setareEroare(data, "Selectează o dată din viitor");
        return;
    }
    if(inputDate.getDay() == '0'){
        setareEroare(data, "Nu lucrăm Duminica");
        return;
    }
    setareSucces(data);
}

function esteGol(str) {
    return (!str || str.length === 0 );
}
function esteValidFormatNume(str) {
    //prenume1 prenume2, prenume1-prenume2, prenume1
    let  numeRegex = /^[a-zA-Z]+((\s|-)[a-zA-Z]+)*$/;
    return numeRegex.test(str);
}
function marimeNevalida(str){
    return str.length > 100;
}
function esteValidFormatVarsta(str){
    let  varstaRegex = /^[0-9]+$/;
    return varstaRegex.test(str);
}
function esteValidFormatTelefon(str){
    let  telefonRegex =/^[\d ]*$/;
    return telefonRegex.test(str);
}
function esteValidFormatEmail(str){
    let emailRegex = /^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@[a-zA-Z0-9-]+(?:\.[a-zA-Z0-9-]+)*$/;
    return emailRegex.test(str);
}
function contineDoarCifre(str){
    let stringCifreRegex = /^[\d]*$/;
    return stringCifreRegex.test(str);
}