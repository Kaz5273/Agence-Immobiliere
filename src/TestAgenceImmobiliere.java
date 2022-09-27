import static org.junit.Assert.assertEquals;

import java.text.DecimalFormat;

import org.junit.Test;

public class TestAgenceImmobiliere {
    private static final double DELTA = 1e-2;

    // @Test
    // public void TestpieceCirculaire() {
    // DecimalFormat numberFormat = new DecimalFormat("#.0");
    // TypePiece chambre = new TypePiece(TypePiece.CHAMBRE, true, true);
    // PieceCirculaire pieceCirculaire = new PieceCirculaire(chambre, "0", 4);
    // assertEquals(50.2, numberFormat.format(pieceCirculaire.surface()), DELTA);
    // }

    @Test
    public void TestpieceParallelogramme() {
        TypePiece chambre = new TypePiece(TypePiece.CHAMBRE, true, true);
        PieceParallelogramme pieceParallelogramme = new PieceParallelogramme(chambre, "0", 4, 5);
        assertEquals(20.0, pieceParallelogramme.surface(), DELTA);
    }

    @Test
    public void TestpieceQuadrilataire() {
        TypePiece chambre = new TypePiece(TypePiece.CHAMBRE, true, true);
        PieceQuadrilatere pieceQuadrilatere = new PieceQuadrilatere(chambre, "0", 5, 7);
        assertEquals(35.0, pieceQuadrilatere.surface(), DELTA);

    }

    @Test
    public void TestTrapezoide() {
        TypePiece chambre = new TypePiece(TypePiece.CHAMBRE, true, true);
        PieceTrapezoidale pieceTrapezoidale = new PieceTrapezoidale(chambre, "0", 4, 8, 15);
        assertEquals(90.0, pieceTrapezoidale.surface(), DELTA);
    }

    @Test
    public void TestTriangulaire() {
        TypePiece chambre = new TypePiece(TypePiece.CHAMBRE, true, true);
        PieceTriangulaire pieceTriangulaire = new PieceTriangulaire(chambre, "0", 5, 7);
        assertEquals(17.5, pieceTriangulaire.surface(), DELTA);
    }

}
