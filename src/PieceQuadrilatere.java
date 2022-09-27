public class PieceQuadrilatere extends Piece {
    private int _longueur;
    private int _largeur;

    public PieceQuadrilatere(TypePiece typePiece, String niveau, int uneLongueur, int uneLargeur) {
        super(typePiece, niveau);
        this._longueur = uneLongueur;
        this._largeur = uneLargeur;

    }

    @Override
    public double surface() {
        double result = 0;
        result = _longueur * _largeur;
        return result;
    }

    public int get_longueur() {
        return _longueur;
    }

    public int get_largeur() {
        return _largeur;
    }

}
