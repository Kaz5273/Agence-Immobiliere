public class PieceCirculaire extends Piece {
    private int _rayon;

    public PieceCirculaire(TypePiece typePiece, String niveau, int unRayon) {
        super(typePiece, niveau);
        this._rayon = unRayon;

    }

    @Override
    public double surface() {
        double result = 0;
        result = Math.PI * Math.pow(_rayon, 2);
        return result;
    }

    public int get_rayon() {
        return _rayon;
    }

}
