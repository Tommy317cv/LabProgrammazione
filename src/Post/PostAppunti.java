package Post;

import java.time.LocalDate;

public class PostAppunti extends PostDocumentale {
    public PostAppunti(LocalDate datapubblicazione, String testodescrittivo, String idalfanumerico, int dimensionetesto, int dimensionetitolo, int dimensionecitazione) {
        super(datapubblicazione, testodescrittivo, idalfanumerico, dimensionetesto, dimensionetitolo, dimensionecitazione);
    }
}
