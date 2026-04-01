package Post;

import java.time.LocalDate;

public class PostAppunti extends PostDocumentale {
    public PostAppunti(String idpost, LocalDate datapubblicazione, String testodescrittivo, String idalfanumerico, int dimensionetesto, int dimensionetitolo, int dimensionecitazione) {
        super(idpost, datapubblicazione, testodescrittivo, idalfanumerico, dimensionetesto, dimensionetitolo, dimensionecitazione);
    }
}
