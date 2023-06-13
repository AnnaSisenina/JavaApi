package Lesson2.HomeWork.sudoko;

public class Main {
    public static void main(String[] args) {
        char[][] board = {
                {'5', '3', '.', '.', '7', '.', '.', '.', '.'},
                {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
                {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
                {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
                {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
                {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
                {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
                {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
                {'.', '.', '.', '.', '8', '.', '.', '7', '9'}};

        System.out.println("Validete:" + isValidSudoku(board));

    }

    /**
     * Проверяет заполнение доски судоку в соответствии с правилами: нет повторов цифр от 1 до 9 в строках и столбцах, а также во внутренних блоках 3х3 доски
     * @param board Доска, которую проверяем
     * @return возвращает true (если доска заполнена верно) или false (если есть повторения)
     */
    private static boolean isValidSudoku(char[][] board) {
        boolean validate = true;
        validate = isValidValue(board, validate);
        validate = isValidColumnsAndLines(board, validate);
        validate = isValidBlocks(board, validate);
        return validate;
    }

    /**
     * Проверяет валидна ли сама доска и заполненные в ней значения
     * @param board Доска, которую проверяем
     * @param validate значение валидатора на данный момент
     * @return значение валидатора - true, если доска и все значения на ней корректны, false - если размер доски или значения не соответствуют условию.
     */
    private static boolean isValidValue(char[][] board, boolean validate) {
        int columnLength = board.length;
        int stringLength = board[1].length;
        if (columnLength != 9 || stringLength !=9) {
            validate = false;
        }
        for (int i = 0; i < columnLength && validate; i ++) {
            for (int j = 0; j < stringLength && validate; j ++) {
                switch (board[i][j]){
                    case ('.'):
                    case ('2'):
                    case ('1'):
                    case ('3'):
                    case ('4'):
                    case ('5'):
                    case ('6'):
                    case ('7'):
                    case ('8'):
                    case ('9'):
                        break;
                    default:
                        validate = false;
                    }
            }
        }
        return validate;
    }

    /**
     * прверяет есть ли совпадающие значения внутри блоков доски
     * @param board Доска, которую валидируем
     * @param validate значение валидатора на данный момент
     * @return возвращает значение валидатора true, если нет совпадений, или false, если совпадения есть
     */
    private static boolean isValidBlocks(char[][] board, boolean validate) {
        int columnLength = board.length;
        int stringLength = board[1].length;
        for (int i = 0; i < columnLength && validate; i += 3) {
            for (int j = 0; j < stringLength && validate; j += 3) {
                char[] block = new char[9];
                int index = 0;
                for (int k = i; k < i + 3; k++) {
                    for (int l = j; l < j + 3; l++) {
                        block[index] = board[k][l];
                        index++;
                    }
                }
                for (int k = 0; k < 9 && validate; k++) {
                    for (int l = k + 1; l < 9; l++) {
                        if (block[k] != ('.')) {
                            if (block[k] == block[l]) {
                                validate = false;
                            }
                        }
                    }

                }

            }

        }
        return validate;
    }

    /**
     * прверяет есть ли совпадающие значения в столбцах и строках
     * @param board Доска, которую валидируем
     * @param validate значение валидатора на данный момент
     * @return  возвращает значение валидатора true, если нет совпадений, или false, если совпадения есть
     */
    private static boolean isValidColumnsAndLines(char[][] board, boolean validate) {
        int columnLength = board.length;
        int stringLength = board[1].length;
        for (int i = 0; i < columnLength && validate; i++) {
            for (int j = 0; j < stringLength && validate; j++) {
                if (board[i][j] != ('.')) { //  если цифры нет (т.е. ячейка пустая) - пропускаем
                    for (int k = j + 1; k < stringLength && validate; k++) {
                        if (board[i][j] == board[i][k]) { // проверяем есть ли такое же число в строке
                            validate = false;
                        }
                    }
                    for (int k = i + 1; k < columnLength && validate; k++) { // проверяем есть ли такое же число в столбце
                        if (board[i][j] == board[k][j]) {
                            validate = false;
                        }
                    }
                }
            }
        }
        return validate;
    }
}
