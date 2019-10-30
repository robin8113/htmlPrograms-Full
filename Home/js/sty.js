$(document).ready(function(){

  $("#rob2").hide();
 $("#rob3").hide();
 $("#rob4").hide();
 $("#rob2").show(1000);
$("#rob3").show(1000);
$("#rob4").show(1000);
$("#but").on("click",function()
{
  var count=3;
  var r=document.getElementById("name").value;
  var c=count+1;
$("#rob1").append("<div id='<%c%>'><br /> </div> ");
var v=document.getElementById();

  var val=document.getElementById(c);

val.innerHTML=r;

});

});
