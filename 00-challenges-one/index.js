let p = document.getElementById('xxx');

function capturarEntrada() {
  let entradaUsuario = document.getElementById('entradaUsuario').value.toLowerCase();


  let novastring = entradaUsuario
  .replace(/i/g , 'imes')
  .replace(/e/g, 'enter')
  .replace(/a/g, 'ai')
  .replace(/o/g, 'ober')
  .replace(/u/g, 'ufat');

  p.innerHTML = novastring;

}

function capturarSaida(){
  let descText = document.getElementById('entradaUsuario').value.toLowerCase();

  let novaString = descText
  .replace(/imenters/g,'i')
  .replace(/enter/g,'e')
  .replace(/ai/g, 'a')
  .replace(/ober/g, 'o')
  .replace(/ufat/g, 'u')

  p.innerHTML = novaString;
}





