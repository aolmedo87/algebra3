package tp2.utils;

public class MatrixMatrixOperation {
    private final Matrix matrix1;
    private final Matrix matrix2;
    private Matrix result;

    public MatrixMatrixOperation(Matrix matrix1, Matrix matrix2) {
        this.matrix1 = matrix1;
        this.matrix2 = matrix2;
    }

    public Matrix getResult() {
        return result;
    }

    public void setResult(Matrix result) {
        this.result = result;
    }

    public int getCounter() {
        return matrix1.getCounter() + matrix2.getCounter();
    }

    public int getCounter(int operandNumber) {
        switch (operandNumber) {
            case 1:
                return matrix1.getCounter();
            case 2:
                return matrix2.getCounter();
            default:
                return 0;
        }
    }

    public int multiplyPositions(int i1, int j1, int i2, int j2) {
        return matrix1.getValue(i1, j1) * matrix2.getValue(i2, j2);
    }

    public Matrix getMatrix1() {
        return matrix1;
    }

    public Matrix getMatrix2() {
        return matrix2;
    }

}
