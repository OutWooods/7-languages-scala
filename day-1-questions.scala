// Write a game that will take a tic-tac-toe board with X, O and blank characters
// and detect the winner or there there is a tie or no winner yet. Use classes where appropriate

// My setup if you give a two dimensional list, "X", "O", "", for the positions. It will tell you if
// Assuming the board given is correct and valid, there are 3 outcomes. No result, X win, O win.
// This is more about learning syntax so I won't be spending ages making it perfect

class ResultChecker(board: List[List[String]]) {
      var xWins: Boolean = false
      var oWins: Boolean = false

      def result() {
            anyWinner()
            checkCols()
            if(xWins) {
                  println("X wins")
                  return;
            }

            if(oWins) {
                  println("O wins")
                  return
            }

            println("No winner")
      }


       def anyWinner() {
             board.foreach { row =>
                 if (row.forall(str => str == "X")) {
                       xWins = true
                 }

                 if (row.forall(str => str == "O")) {
                       oWins = true
                 }
            }
       }

       def checkCols() {
             for(col <- 0 until board.length) {
                   val column = board.map(row => row(col))

                 if (column.forall(str => str == "X")) {
                       xWins = true
                 }

                 if (column.forall(str => str == "1")) {
                       oWins = true
                 }
            }
       }
}

val board = new ResultChecker(List(List("X", "X", "O"), List("X", "1", "2"), List("X", "1", "2")))
board.result()

