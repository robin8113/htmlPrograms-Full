var usern=document.getElementById("username");
function check()
{
  var txt=document.getElementById("text");
  var us=usern.value;
  txt.textContent=us;
}
function setup() {                                  // Declare function
  var textInput;                                    // Create variable
  textInput = document.getElementById('username');  // Get username input
  textInput.focus();                                // Give username focus
}
window.addEventListener('load',setup);



function checkUsername() {                        // Declare function
  var username = el.value;                        // Store username in variable
  if (username.length < 5) {                      // If username < 5 characters
    elMsg.className = 'warning';                  // Change class on message
    elMsg.textContent = 'Not long enough, yet...';// Update message
  } else {                                        // Otherwise
    elMsg.textContent = '';                       // Clear the message
  }
}
function tipUsername() {                          // Declare function
  elMsg.className = 'tip';                        // Change class for message
  elMsg.innerHTML = 'Username must be at least 5 characters'; // Add message
}
var el = document.getElementById('username');     // Username input
var elMsg = document.getElementById('feedback');  // Element to hold message
// When the username input gains / loses focus call functions above:
el.addEventListener('focus', tipUsername); // focus call tipUsername()
el.addEventListener('blur', checkUsername);// blur call checkUsername()

var msg = '<div class=\"header\"><a id=\"close\" href="#">close X</a></div>';
msg += '<div><h2>System Maintenance</h2>';
msg += 'Our servers are being updated between 3 and 4 a.m. ';
msg += 'During this time, there may be minor disruptions to service.</div>';
var elNote = document.createElement('div');
var r1= document.createElement('rob4');      // Create a new element
elNote.setAttribute('id', 'note');                // Add an id of note
elNote.innerHTML = msg;                           // Add the message
document.body.appendChild(r1);                // Add it to the page
  function dismissNote() {                          // Declare function
  document.body.removeChild(r1);              // Remove the note
}
var elClose = document.getElementById('close');   // Get the close button
elClose.addEventListener('click', dismissNote);// Click close-clear note
