Project by
-David Rodriguez @marindev
Student UNAH, Honduras
***************************
Project: Sudoku
***************************
the project consists of the classic sudoku game.
A single size board.

Inside the project folder you will find another folder named "soluciones sudoku", 
which contains the respective solutions to the sudoku templates available in the game.

It is also worth noting the distribution of the 3 main classes of the project.

"ArrayListPlantillas":
It is in charge of loading the templates that the game has, in this case there are only 5 templates, 
which I mentioned in the previous paragraph.

"ManejadorCasillasVacias"
This class is in charge of validating the boxes that are empty at the beginning of the game, 
and as it is filled in, it will make the respective validations, 
so that the templates are compared to the respective solutions.

"Ventana":
Only the "graphical" aspects are handled here, everything that has to do with buttons, windows, labels, etc.
And in this class is the main class, therefore we must run the project from this class.