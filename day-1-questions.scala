// Write a game that will take a tic-tac-toe board with X, O and blank characters
// and detect the winner or there there is a tie or no winner yet. Use classes where appropriate

// My setup if you give a two dimensional list, "X", "O", "", for the positions. It will tell you if
// Assuming the board given is correct and valid, there are 3 outcomes. No result, X win, O win.
// This is more about learning syntax so I won't be spending ages making it perfect

class ResultChecker(board: List[List[String]]) {
      var xWins: Boolean = false
      var oWins: Boolean = false

      def result() {
            checkRows()
            checkCols()
            checkDownWardDiag()
            checkUpwardDiag()
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


       def checkRows() {
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

                 if (column.forall(str => str == "O")) {
                       oWins = true
                 }
            }
       }

       def checkDownWardDiag() {
             val downward  = board.zipWithIndex.map{ case(row, index) => row(index)}

                 if (downward.forall(str => str == "X")) {
                       xWins = true
                 }

                 if (downward.forall(str => str == "O")) {
                       oWins = true
                 }
       }

       def checkUpwardDiag() {
             val upward  = board.zipWithIndex.map{ case(row, index) => row(board.length - index - 1)}

                 if (upward.forall(str => str == "X")) {
                       xWins = true
                 }

                 if (upward.forall(str => str == "O")) {
                       oWins = true
                 }
       }
}

val xWins = new ResultChecker(List(List("X", "X", "O"), List("O", "X", "2"), List("O", "1", "X")))
xWins.result()
val nobodyWins = new ResultChecker(List(List("X", "X", ""), List("O", "O", "2"), List("O", "1", "X")))
nobodyWins.result()
val oWins = new ResultChecker(List(List("X", "X", "O"), List("O", "O", "2"), List("O", "1", "X")))
oWins.result()

