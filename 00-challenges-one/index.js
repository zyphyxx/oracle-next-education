// Adiciona o listener de input ao elemento com id 'saidaDeTexto'
document.getElementById('entradaUsuario').addEventListener('input', function(event) {
  let valorDigitado = event.target.value;
  let regex = /^[a-zA-Z0-9 ]*$/;

  if (!regex.test(valorDigitado)) {
    alert("Por favor, insira apenas letras, números e espaços.");
    event.target.value = valorDigitado.replace(/[^a-zA-Z0-9 ]/g, '');
  }
});

// Adiciona o listener de click ao botão com id 'capturarEntradaBtn'
document.getElementById('capturarEntradaBtn').addEventListener('click', function() {
  let entradaUsuario = document.getElementById('entradaUsuario').value.toLowerCase();

  let novaString = entradaUsuario
    .replace(/i/g, 'imes')
    .replace(/e/g, 'enter')
    .replace(/a/g, 'ai')
    .replace(/o/g, 'ober')
    .replace(/u/g, 'ufat');

  // Exibe a saída transformada no elemento com id 'saidaDeTexto'
  document.getElementById('saidaDeTexto').innerHTML = novaString;
});

// Adiciona o listener de click ao botão com id 'capturarSaidaBtn'
document.getElementById('capturarSaidaBtn').addEventListener('click', function() {
  let descText = document.getElementById('saidaDeTexto').innerHTML.toLowerCase();

  let novaString = descText
    .replace(/imenters/g, 'i')
    .replace(/enter/g, 'e')
    .replace(/ai/g, 'a')
    .replace(/ober/g, 'o')
    .replace(/ufat/g, 'u');

  // Exibe a saída transformada no elemento com id 'saidaDeTexto'
  document.getElementById('saidaDeTexto').innerHTML = novaString;
});
