function eliminar(id) {

	swal({
		title: "Estas Seguro de Eliminar?",
		text: "Si lo eliminás, cagaste! no se puede recuperar!!",
		icon: "warning",
		buttons: true,
		dangerMode: true,
	})
		.then((ok) => {
			if (ok) {
			$.ajax({
			url:"/eliminar/" + id,
			success: function(res){
			console.log(res);
			}
			});
				swal("A la mierda tu archivo", {
					icon: "success",
				}).then((ok)=>{
				if(ok){
				location.href="/listar";
				}
				});
			} else {
				swal("Te Arrepentiste, Cagon!");
			}
		});
}