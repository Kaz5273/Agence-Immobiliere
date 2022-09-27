public class PieceTrapezoidale extends Piece {
    private int _grandebase;
    private int _petitbase;
    private int _hauteur;

    public PieceTrapezoidale(TypePiece typePiece, String niveau, int uneGrandeBase, int unePetitBase, int uneHauteur) {
        super(typePiece, niveau);
        this._grandebase = uneGrandeBase;
        this._petitbase = unePetitBase;
        this._hauteur = uneHauteur;
    }

    @Override
    public double surface() {
        double result = 0;
        result = (_grandebase + _petitbase) * _hauteur * 1 / 2;
        return result;
    }

}
