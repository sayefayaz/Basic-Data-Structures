public class Sparse_matrix {

  private int[][] sparseMatrix;
  public Sparse_matrix(int[][] matrix)
  {
    int count=Counter(matrix);
    sparseMatrix=new int[count][3];
    int index=0;
    for (int i = 0; i < matrix.length; i++) {
        for (int j = 0; j < matrix[0].length; j++) {
            if (matrix[i][j]!=0) {
                sparseMatrix[index][0]=i;
                sparseMatrix[index][1]=j;
                sparseMatrix[index][2]=matrix[i][j];
                index++;
            }
        }
    }
  }
  private int Counter(int[][] matrix) {
    int count=0;
    for (int i = 0; i < matrix.length; i++) {
        for (int j = 0; j < matrix[0].length; j++) {
            if (matrix[i][j]!=0) {
                count++;
            }
        }
    }
     return count;
  }
    public void sout() 
    {
        for (int i = 0; i < sparseMatrix.length; i++) {
            System.out.println(sparseMatrix[i][0]+" "+sparseMatrix[i][1]+" "+sparseMatrix[i][2]);
        }
    }
    public void transpose()
    {
        for (int i = 0; i < sparseMatrix.length; i++) {
            int h=sparseMatrix[i][0];
            sparseMatrix[i][0]=sparseMatrix[i][1];
            sparseMatrix[i][1]=h;
        }
    }
    public void newElement(int row , int col , int newValue)
    {
        for (int i = 0; i < sparseMatrix.length; i++) {
            if (sparseMatrix[i][0]==row && sparseMatrix[i][1]==col) {
                sparseMatrix[i][2]=newValue;
                break;
            }
        }
    }
    public static void main(String[] args) {
        int[][] matrix={
            {0,0,3,0},
            {0,0,5,0},
            {0,0,0,0},
            {7,0,0,9},
        };
        Sparse_matrix sparseMatrix=new Sparse_matrix(matrix);
        sparseMatrix.sout();
        sparseMatrix.transpose();
        sparseMatrix.sout();
        sparseMatrix.newElement(1, 2, 8);
        sparseMatrix.sout();

    }
}