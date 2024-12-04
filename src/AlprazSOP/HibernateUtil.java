package AlprazSOP;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
    private static final SessionFactory sessionFactory = buildSessionFactory();

    // Membangun SessionFactory
    private static SessionFactory buildSessionFactory() {
        try {
            // Membaca konfigurasi Hibernate dan membuat SessionFactory
            return new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(ProdukSales.class).buildSessionFactory();
        } catch (Exception e) {
            // Jika terjadi kesalahan dalam konfigurasi, tampilkan pesan error
            System.err.println("Initial SessionFactory creation failed." + e);
            throw new ExceptionInInitializerError(e);
        }
    }

    // Mendapatkan SessionFactory
    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    // Menutup SessionFactory jika aplikasi selesai digunakan
    public static void shutdown() {
        getSessionFactory().close();
    }
}

