TriConsole
==========

Terminal window with with separate frames for output, input, and commands

 * Output frame (At the top): Shows all program ouput and input/commands that the have been processed.
 * Input frame (in the middle): Allows the user to enter standard input. Only show when a program is waiting for standard input.
 * Command frame (at the bottom): Allows the user to enter commands.


Benefits:
1. It would be obvious when I wrote a command that is waiting for user input.
2. It could allow you to provide standard input via a command after running another command.

This could probably also be done in one frame with coloring to show the different parts. The prompt would change color when waiting for standard input (as opposed to waiting for the process to finish).

Idea from http://jamesjava.blogspot.com/2007/09/terminal-window-with-3-frames.html

