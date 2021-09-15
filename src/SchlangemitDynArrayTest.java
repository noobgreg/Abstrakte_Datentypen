import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class SchlangemitDynArrayTest {

    SchlangemitDynArray array;

    @BeforeEach
    void setUp() {
        array = new SchlangemitDynArray<>();
    }

    @AfterEach
    void tearDown() {
        array = null;
    }

    @Test
    void size() {
        for (int i=0; i<10; i++) {
            array.insert(i);
        }
        assertEquals(10, array.size());
    }

    @Test
    void isEmpty() {
        array.insert("String");
        assertEquals(false, array.isEmpty());
    }

    @Test
    void first() {
        for (int i=0; i<10; i++) {
            array.insert(i);
        }
        assertEquals(0, array.first());
    }

    @Test
    void insert() {
        for (int i=0; i<10; i++) {
            array.insert(i);
        }
        assertEquals(0, array.first());

    }

    @Test
    void remove() {
        for (int i=0; i<10; i++) {
            array.insert(i);
        }
        assertEquals(0, array.remove());

    }
}