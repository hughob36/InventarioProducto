// Call the dataTables jQuery plugin
$(document).ready(function() {

    cargarProducto();
    
    $('#tabla1').DataTable();
  });
  
async function cargarProducto(){
  
    const request = await fetch('/producto/traer', {
     
      method: 'GET',
      headers: {
        'Accept': 'application/json',
        'Content-Type': 'application/json'
      }
    });
    const productos = await request.json();
  
  let listaHtml = '';
  
  for(let producto of productos){
 
 // let precioFormateado = usuario.precio.toString(); // Convierte el precio a string por seguridad
  
  //let boton = '<a href="#" onclick="borrarUsuario();" class="btn btn-danger btn-circle"><i class="fas fa-trash"></i></a>'
  
    let usuarioHtml = '<tr><th scope="row">'+ producto.id + 
                      '</th><td>' + producto.nombre +
                      '</td><td>' + producto.cantidad+ 
                      '</td><td>' + producto.precioUnidad +
                       '</td><td></td></tr>';

    listaHtml += usuarioHtml;
    }
  
    document.querySelector('#tabla1 tbody').outerHTML = listaHtml;
  }
  
  /*async function borrarUsuario(id){
  
     if(!confirm('¡Estas seguro que quieres eliminar! ')){
      return;
     }
       const request = await fetch(`/usuario/delete/${id}`, {
          method: 'DELETE',
          headers: {
            'Accept': 'application/json',
            'Content-Type': 'application/json'
          }
        });
  
     location.reload();
  }*/

