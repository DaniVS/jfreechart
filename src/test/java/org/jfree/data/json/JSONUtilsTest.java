package org.jfree.data.json;

import org.jfree.data.ComparableObjectItem;
import org.jfree.data.KeyedValues;
import org.jfree.data.KeyedValues2D;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class JSONUtilsTest {

    private String defaultTestKey1;
    private String defaultTestKey2;

    @BeforeEach
    void setUp() {
        defaultTestKey1 = "testKey1";
        defaultTestKey2 = "testKey2";
    }

    private KeyedValues getKeyedValues() {
        return new KeyedValues() {

            @Override
            public Comparable getKey(int index) {
                return null;
            }

            @Override
            public int getIndex(Comparable key) {
                return 0;
            }

            @Override
            public List getKeys() {
                return Arrays.asList(defaultTestKey1, defaultTestKey2);
            }

            @Override
            public Number getValue(Comparable key) {
                return -1;
            }

            @Override
            public int getItemCount() {
                return 0;
            }

            @Override
            public Number getValue(int index) {
                return 0;
            }
        };
    }

    private KeyedValues2D getKeyedValues2D() {
        return new KeyedValues2D() {
            @Override
            public Comparable getRowKey(int row) {
                return null;
            }

            @Override
            public int getRowIndex(Comparable key) {
                return 0;
            }

            @Override
            public List getRowKeys() {
                return Arrays.asList(defaultTestKey1, defaultTestKey2);
            }

            @Override
            public Comparable getColumnKey(int column) {
                return null;
            }

            @Override
            public int getColumnIndex(Comparable key) {
                return 0;
            }

            @Override
            public List getColumnKeys() {
                return Arrays.asList(defaultTestKey1, defaultTestKey2);
            }

            @Override
            public Number getValue(Comparable rowKey, Comparable columnKey) {
                return null;
            }

            @Override
            public int getRowCount() {
                return 0;
            }

            @Override
            public int getColumnCount() {
                return 0;
            }

            @Override
            public Number getValue(int row, int column) {
                return null;
            }
        };
    }

    @Test
    void throwExceptionWhenInputIsNull(){
        assertThrows(
                IllegalArgumentException.class,
                () -> JSONUtils.writeKeyedValues(null)
        );

        assertThrows(
                IllegalArgumentException.class,
                () -> JSONUtils.writeKeyedValues(null, null)
        );

        assertThrows(
                IllegalArgumentException.class,
                () -> JSONUtils.writeKeyedValues2D(null)
        );
    }

    @Test
    void canConvertKeyedValuesToJson(){
        KeyedValues<ComparableObjectItem> data = getKeyedValues();

        String result = JSONUtils.writeKeyedValues(data);

        assertNotNull(result);
        assertTrue(result.contains(defaultTestKey1));
        assertTrue(result.contains(defaultTestKey2));
    }

    @Test
    void canConvertKeyedValues2DToJson(){
        KeyedValues2D data = getKeyedValues2D();

        String result = JSONUtils.writeKeyedValues2D(data);

        assertNotNull(result);
        assertTrue(result.contains(defaultTestKey1));
        assertTrue(result.contains(defaultTestKey2));
    }
}
