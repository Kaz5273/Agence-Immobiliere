public class PieceParallelogramme extends Piece {

    private int _base;
    private int _hauteur;

    public PieceParallelogramme(TypePiece typePiece, String niveau, int uneBase, int uneHauteur) {
        super(typePiece, niveau);
        this._base = uneBase;
        this._hauteur = uneHauteur;

    }

    @Override
    public double surface() {
        double result = 0;
        result = _base * _hauteur;
        return result;
    }

    public int get_base() {
        return _base;
    }

    public int get_hauteur() {
        return _hauteur;
    }

}
