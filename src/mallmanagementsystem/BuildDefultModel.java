package mallmanagementsystem;

import java.sql.*;
import java.util.List;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;

public class BuildDefultModel {

    private static Vector<Vector<Object>> data;
    static ResultSetMetaData metaData;

    public static DefaultTableModel buildTableModel(ResultSet rs, List<String> co) throws SQLException {

        Vector<String> v = new Vector<>(co);
        if (data != null) {
            return new DefaultTableModel(data, v);
        }
        metaData = rs.getMetaData();
        int c = metaData.getColumnCount();

        data = new Vector<Vector<Object>>();
        while (rs.next()) {
            Vector<Object> vector = new Vector<>();
            for (int i = 1; i <= c; i++) {
                vector.add(rs.getObject(i));
            }
            data.add(vector);
        }

        return new DefaultTableModel(data, v);
    }

}
