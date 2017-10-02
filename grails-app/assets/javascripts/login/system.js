function onCadastroDone(data){
  showMessage(`Bem vindo, ${data.nome}`)
  console.dir(data)
}
function onLoginDone(data){
  showMessage(data.nome);
  setTimeout(()=>{
    showMessage("Login Autorizado")
  }, 1000)
  setTimeout(()=>{
    window.location = data.redirect;
  }, 1000)
}
