$(document).ready(function(){

  $(document).on('keypress',function(e) {
    var na=document.getElementById('name').value;

    if(e.which == 13) {
        $('.select').append("<li><span>"+na+"</span></li>")
        $("#name").val("");

    }
    $(" span li").hover(function(){
     $("li").toggleClass();
    });

  

var listItems = document.getElementsByTagName("li"); // or document.querySelectorAll("li");
for (var i = 0; i < listItems.length; i++) {
  listItems[i].onclick = function() {this.parentNode.removeChild(this);}
}
});
});
