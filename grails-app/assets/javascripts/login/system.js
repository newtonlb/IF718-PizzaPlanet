function onCadastroDone(data){
  showMessage(`Bem vindo, ${data.nome}`)
  console.dir(data)
}
function onLoginDone(data){
console.dir(data)
  setCookie('usuario[id]', data.id)
  setCookie('usuario[nome]', data.nome)
  setCookie('usuario[tipo]', data.tipo)

  showMessage(data.nome);
  setTimeout(()=>{
    showMessage("Login Autorizado")
  }, 1000)
  setTimeout(()=>{
    redirect(data.redirect);
  }, 1000)
}
