 $(document).ready(
 function(){
	$('#ecorstate').append($('<option>').text("Select State"));
	$('#ecorcity').append($('<option>').text("Select City"));
	$.getJSON("StateJSON",{ajax:true},function(data){
   
	 $.each(data,function(i,item){
	 $('#ecorstate').append($('<option>').val(item.STATEID).text(item.STATENAME));
  });	 
	 
 });	
 
 $('#ecorstate').change(function(){
 $.getJSON('CityJSON',{ajax:true,stateid:$('#ecorstate').val()},function(data){
	 $('#ecorcity').empty();
	 $('#ecorcity').append($('<option>').text("Select City"));
 $.each(data,function(i,item){
	 $('#ecorcity').append($('<option>').val(item.CITYID).text(item.CITYNAME));
  });	 
	 
	 
 });	 
	 
 });
 
	
});
 
 
 $(document).ready(
		 function(){
			$('#eperstate').append($('<option>').text("Select State"));
			$('#epercity').append($('<option>').text("Select City"));
			$.getJSON("StateJSON",{ajax:true},function(data){
		   
			 $.each(data,function(i,item){
			 $('#eperstate').append($('<option>').val(item.STATEID).text(item.STATENAME));
		  });	 
			 
		 });	
		 
		 $('#eperstate').change(function(){
		 $.getJSON('CityJSON',{ajax:true,stateid:$('#eperstate').val()},function(data){
			 $('#epercity').empty();
			 $('#epercity').append($('<option>').text("Select City"));
		 $.each(data,function(i,item){
			 $('#epercity').append($('<option>').val(item.CITYID).text(item.CITYNAME));
		  });	 
			 
			 
		 });	 
			 
		 });
		 
			
		});
 
 
 
 
 
 
 