package edu.hw3.Task5;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;
import java.util.List;

public class TestContacts {
    @Test
    void asc() {
        String[] contacts = {"John Locke", "Thomas Aquinas", "David Hume", "Rene Descartes"};
        List<Contact> ordered = Sort.parseContacts(contacts, "ASC");
        for (int i = 0; i < ordered.size() - 1; i++) {
            assertThat(ordered.get(i).getLastName())
                .isLessThanOrEqualTo(ordered.get(i + 1).getLastName());
        }
    }

    @Test
    void desc() {
        String[] contacts = {"John Locke", "Thomas Aquinas", "David Hume", "Rene Descartes"};
        List<Contact> ordered = Sort.parseContacts(contacts, "DESC");
        for (int i = 0; i < ordered.size() - 1; i++) {
            assertThat(ordered.get(i).getLastName())
                .isGreaterThanOrEqualTo(ordered.get(i + 1).getLastName());
        }
    }
}
