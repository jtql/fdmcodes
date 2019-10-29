/**
 * 
 */


// 0. The browser will execute the script only once the page has fully loaded 


window.onload = init; 
function init(){ 


// We need to tell the browser to call handleAddItemClick when addButton is clicked 


// This can be done with the onclick property (similar to the onload property) 


// 1. Set up a handler (function) to handle the user’s click on the Add Item button 


	var addButton = document.getElementById("addButton"); 
	addButton.onclick = handleAddItemClick; 
} 


// This is the code to call when the add button is clicked 


function handleAddItemClick(){ 


// 2. Get the task typed in by the user 


// First, get the element 


var textInput = document.getElementById("toDoItemTextInput"); 


// Next, get the text content from the text box 


var toDoItemContent = textInput.value; 


// 3. Create a new element to hold that task 


// Every new task needs to be added as a list item element to the toDoItems unordered list 


// Refer to our original sample list items from version 1.0 of the application  


// <li><input type="checkbox"><span>To do</span></li> 


// Create the input element and set its type attribute to "checkbox" 


var newInput = document.createElement("input"); 
newInput.setAttribute("type","checkbox"); 


// Create the span and set its body to the text provided by the user 


var newSpan = document.createElement("span"); 
newSpan.innerHTML = toDoItemContent; 


// Create the list item and add the input and span as child elements 


var newListItem = document.createElement("li"); 
newListItem.appendChild(newInput); 
newListItem.appendChild(newSpan); 


// 4. Add it to the DOM 


var toDoItems = document.getElementById("toDoItems"); 
toDoItems.appendChild(newListItem); 


} 
