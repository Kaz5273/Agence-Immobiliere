public class PieceTriangulaire extends Piece {
    private int _base;
    private int _hauteur;

    public PieceTriangulaire(TypePiece typePiece, String niveau, int uneBase, int unehauteur) {
        super(typePiece, niveau);
        this._base = uneBase;
        this._hauteur = unehauteur;
    }

    @Override
    public double surface() {
        double result = 0;

        result = _base * _hauteur * 1 / 2;

        return result;
    }

    public int get_base() {
        return _base;
    }

    public int get_hauteur() {
        return _hauteur;
    }

}
