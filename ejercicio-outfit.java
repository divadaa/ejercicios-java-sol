var temperature = 40;
var sky = "llueve"
var outfit = temperature || sky
var message = temperature || sky

if (outfit <= 25 && "llueve"){
console.log(temperature, sky) 
} else if (outfit <= 25 && "sol"){
  console.log(temperature, sky)
} else if (outfit > 25 && outfit < 50 && "sol"){ 
  console.log(temperature, sky)
} else if(outfit > 25 && outfit < 50 && "llueve")
  console.log(temperature, sky)

if (message <= 25 && "llueve") {
console.log("Ponte un sweter y un paraguas")
} else if (message <= 25 && "sol"){
  console.log("Ponte un sweter y un sombrero")
} else if (message > 25 && message < 50 && "sol"){  
  console.log("Ponte una camiseta y un sombrero")
} else if(message > 25 && message < 50 && "llueve")
  console.log("Ponte una camiseta y un paraguas")


 // Sigo teniendo duda con la variable auxiliar de message, así que no sé si la 
 // solución que he dado es demasiado larga....
 // He intentado sumar en outfit = temperature + sky, pero no me da resultado.