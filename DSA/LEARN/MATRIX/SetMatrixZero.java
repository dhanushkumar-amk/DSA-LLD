package DSA.LEARN.MATRIX;

public class SetMatrixZero {
    public static void main(String[] args) {
        int[][] matrix = {
                {1,1,1,1},
                {1,0,1,1},
                {1,1,0,1},
                {0,1,1,1}
        };

        setZeroes(matrix);

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }


    }

    public static void setZeroes(int[][] a) {
        int n=a[0].length, m=a.length;
        int row[]=new int[m];
        int col[]=new int[n];
        int i,j;
        for(i=0;i<m;i++)
        {
            for(j=0;j<n;j++)
            {
                if(a[i][j]==0)
                {
                    row[i]=-1;
                    col[j]=-1;
                }
            }
        }
        for(i=0;i<m;i++)
        {
            for(j=0;j<n;j++)
            {
                if(row[i]==-1 || col[j]==-1)
                {
                    a[i][j]=0;
                }
            }
        }
    }
}
