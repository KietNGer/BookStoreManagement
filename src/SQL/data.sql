ALTER SESSION SET NLS_DATE_FORMAT = 'DD-MM-YYYY HH24:MI:SS';
--TAIKHOAN
INSERT INTO TAIKHOAN(MATK, TENDN, MATKHAU, HOTEN, NGAYSINH, DIACHI, SDT, GMAIL, NGAYTAOTAIKHOAN, CHUCVU, LUONG) 
VALUES (SQ_TK.NEXTVAL, 'qly1', '123456', N'Nguyễn Văn A', '11-01-1999', N'43 Tân Lập, Phường Đông Hoà, Dĩ An, Bình Dương',  '0111111111', N'a@gmail.com',  '12-01-2019', N'Quản lý', 40000);

INSERT INTO TAIKHOAN(MATK, TENDN, MATKHAU, HOTEN, NGAYSINH, DIACHI, SDT, GMAIL, NGAYTAOTAIKHOAN, CHUCVU, LUONG) 
VALUES (SQ_TK.NEXTVAL, 'qly2', '654321', N'Trần Thị B', '11-03-1999', N'44 Tân Lập, Phường Đông Hoà, Dĩ An, Bình Dương',  '0111221111', N'b@gmail.com',  '12-01-2019', N'Quản lý', 45000);

INSERT INTO TAIKHOAN(MATK, TENDN, MATKHAU, HOTEN, NGAYSINH, DIACHI, SDT, GMAIL, NGAYTAOTAIKHOAN, CHUCVU, LUONG) 
VALUES (SQ_TK.NEXTVAL, 'nv1', '1234567', N'Huỳnh Thế C', '23-08-2003', N'45 Tân Lập, Phường Đông Hoà, Dĩ An, Bình Dương',  '0333333333', N'c@gmail.com',  '28-02-2022', N'Nhân viên', 22000);

INSERT INTO TAIKHOAN(MATK, TENDN, MATKHAU, HOTEN, NGAYSINH, DIACHI, SDT, GMAIL, NGAYTAOTAIKHOAN, CHUCVU, LUONG) 
VALUES (SQ_TK.NEXTVAL, 'nv2', '1234568', N'Lung Thị Linh', '03-05-2002', N'34 Đường Số 12, Phường Trường Thọ, Thủ Đức, TP HCM',  '0122211111', N'linh@gmail.com',  '15-01-2021', N'Nhân viên', 25000);

INSERT INTO TAIKHOAN(MATK, TENDN, MATKHAU, HOTEN, NGAYSINH, DIACHI, SDT, GMAIL, NGAYTAOTAIKHOAN, CHUCVU, LUONG) 
VALUES (SQ_TK.NEXTVAL, 'nv3', '1234569', N'Lê Văn Đô', '06-05-2002', N'43 Đường Số 12, Phường Trường Thọ, Thủ Đức, TP HCM',  '0122211133', N'do@gmail.com',  '18-08-2021', N'Nhân viên', 25000);

INSERT INTO TAIKHOAN(MATK, TENDN, MATKHAU, HOTEN, NGAYSINH, DIACHI, SDT, GMAIL, NGAYTAOTAIKHOAN, CHUCVU, LUONG) 
VALUES (SQ_TK.NEXTVAL, 'nv4', '1234570', N'Trần Văn D', '06-08-1999', N'16 Lê Văn Việt, Q9, TP HCM',  '0123211133', N'D@gmail.com',  '18-08-2021', N'Nhân viên kho', 30000);

INSERT INTO TAIKHOAN(MATK, TENDN, MATKHAU, HOTEN, NGAYSINH, DIACHI, SDT, GMAIL, NGAYTAOTAIKHOAN, CHUCVU, LUONG) 
VALUES (SQ_TK.NEXTVAL, 'nv5', '1234670', N'Đỗ Văn Nam', '06-10-1999', N'17 Nguyễn Văn Tăng, Q9, TP HCM',  '0123222233', N'nam@gmail.com',  '18-09-2021', N'Kế toán', 30000);

--KHACHHANG
INSERT INTO KHACHHANG(MAKH, HOTEN, NGAYSINH, SDT, DIACHI, CCCD, GIOITINH)
VALUES (SQ_KH.NEXTVAL, N'Nguyễn A', '07-07-1980',  '0123456789', N'32 Đường Số 3, Phường Trường Thọ, Thủ Đức, TP HCM ', '023456789111', N'Nam');

INSERT INTO KHACHHANG(MAKH, HOTEN, NGAYSINH, SDT, DIACHI, CCCD, GIOITINH)
VALUES (SQ_KH.NEXTVAL, N'Nguyễn B', '07-08-1980', '0124456789', N'32  Đường Số 3, Phường Trường Thọ, Thủ Đức, TP HCM', '023456799111', N'Nữ');

INSERT INTO KHACHHANG(MAKH, HOTEN, NGAYSINH, SDT, DIACHI, CCCD, GIOITINH)
VALUES (SQ_KH.NEXTVAL, N'Lê C', '17-08-1985', '0124756789', N'14 Đường Số 3, Phường Trường Thọ, Thủ Đức, TP HCM', '023456799222', N'Nữ');

INSERT INTO KHACHHANG(MAKH, HOTEN, NGAYSINH, SDT, DIACHI, CCCD, GIOITINH)
VALUES (SQ_KH.NEXTVAL, N'Trần Thị D', '20-06-1998', '0384756789', N'244 Nguyễn Thượng Hiền, Phường 6, Quận Bình Thạnh, TP HCM', '044335274136', N'Nữ');

INSERT INTO KHACHHANG(MAKH, HOTEN, NGAYSINH, SDT, DIACHI, CCCD, GIOITINH)
VALUES (SQ_KH.NEXTVAL, N'Trần Văn D', '22-06-2002', '0358589888',  N'243A Nguyễn Thượng Hiền, Phường 6, Quận Bình Thạnh, TP HCM', '053335274136', N'Nam');

--THELOAI
INSERT INTO THELOAI(MATL, TENTHELOAI) VALUES
(SQ_TL.NEXTVAL, N'Viễn tưởng');

INSERT INTO THELOAI(MATL, TENTHELOAI) VALUES
(SQ_TL.NEXTVAL, N'Kinh dị');

INSERT INTO THELOAI(MATL, TENTHELOAI) VALUES
(SQ_TL.NEXTVAL, N'Phiêu lưu');

INSERT INTO THELOAI(MATL, TENTHELOAI) VALUES
(SQ_TL.NEXTVAL, N'Hài hước');

INSERT INTO THELOAI(MATL, TENTHELOAI) VALUES
(SQ_TL.NEXTVAL, N'Thiếu nhi');

INSERT INTO THELOAI(MATL, TENTHELOAI) VALUES
(SQ_TL.NEXTVAL, N'Tâm lý');

--SACH
INSERT INTO SACH(MASACH, TENSACH, GIATIEN, MATL, SLHIENCO, TENTG, NXB, ANHSACH) VALUES
(SQ_S.NEXTVAL, N'Đắc nhân tâm', 86000, 6, 25, N'Dale Carnegie', N'NXB Tổng Hợp TPHCM', N'\Book_img\dacnhantam.jpg');

INSERT INTO SACH(MASACH, TENSACH, GIATIEN, MATL, SLHIENCO, TENTG, NXB, ANHSACH) VALUES
(SQ_S.NEXTVAL, N'7 Thói quen để thành công', 118000, 6, 25, N'Stephen Covey', N'NXB Trẻ', N'\Book_img\7thoiquendethanhcong.jpg');

INSERT INTO SACH(MASACH, TENSACH, GIATIEN, MATL, SLHIENCO, TENTG, NXB, ANHSACH) VALUES
(SQ_S.NEXTVAL, N'IT', 288000, 2, 25, N'Stephen King', N'NXB Thanh niên', N'\Book_img\IT.jpg');

INSERT INTO SACH(MASACH, TENSACH, GIATIEN, MATL, SLHIENCO, TENTG, NXB, ANHSACH) VALUES
(SQ_S.NEXTVAL, N'The Shining', 166000, 2, 5, N'Stephen King', N'NXB Thanh niên', N'\Book_img\theshining.jpg');

INSERT INTO SACH(MASACH, TENSACH, GIATIEN, MATL, SLHIENCO, TENTG, NXB, ANHSACH) VALUES
(SQ_S.NEXTVAL, N'Hai vạn dặm dưới đáy biển', 67000, 3 , 5, N'Jules Verne', N'NXB Kim Đồng', N'\Book_img\haivandamduoidaybien.jpg');

INSERT INTO SACH(MASACH, TENSACH, GIATIEN, MATL, SLHIENCO, TENTG, NXB, ANHSACH) VALUES
(SQ_S.NEXTVAL, N'Nhà giả kim', 69000, 3 , 10,  N'Paulo Coelho', N'NXB Văn Học', N'\Book_img\nhaGIATIENkim.jpg');

INSERT INTO SACH(MASACH, TENSACH, GIATIEN, MATL, SLHIENCO, TENTG, NXB, ANHSACH) VALUES
(SQ_S.NEXTVAL, N'Người truyền kí ức', 70000, 1 , 5,  N'Louis Lowry', N'NXB Hội Văn Học', N'\Book_img\nguoitruyenkiuc.jpg');

INSERT INTO SACH(MASACH, TENSACH, GIATIEN, MATL, SLHIENCO, TENTG, NXB, ANHSACH) VALUES
(SQ_S.NEXTVAL, N'Ông trăm tuổi trèo qua cửa số và biến mất', 164000, 4 , 5,  N'Jonas Jonasson', N'NXB Trẻ', N'\Book_img\ongtramtuoi.jpg');

INSERT INTO SACH(MASACH, TENSACH, GIATIEN, MATL, SLHIENCO, TENTG, NXB, ANHSACH) VALUES
(SQ_S.NEXTVAL, N'Những Cuộc Phiêu Lưu Của Pinocchio', 114000, 5 , 5,  N'Carlo Collodi', N'NXB Dân Trí', N'\Book_img\pinochio.jpg');

--HOADON
INSERT INTO HOADON(MAHD, MAKH, MATK) VALUES 
(SQ_HD.NEXTVAL, NULL, 1);
 
INSERT INTO HOADON(MAHD, MAKH, MATK) VALUES 
(SQ_HD.NEXTVAL, 4, 1);

--CTHD
INSERT INTO CTHD(MAHD, MASACH, SOLUONGMUATUNGCUONSACH) VALUES
(1, 1, 5);

INSERT INTO CTHD(MAHD, MASACH, SOLUONGMUATUNGCUONSACH) VALUES
(1, 2, 5);

INSERT INTO CTHD(MAHD, MASACH, SOLUONGMUATUNGCUONSACH) VALUES
(2, 5, 5);

INSERT INTO CTHD(MAHD, MASACH, SOLUONGMUATUNGCUONSACH) VALUES
(2, 6, 5);

---NHAPHANPHOI
INSERT INTO NHAPHANPHOI(MANPP,TENNPP, DIACHI, SDT) VALUES
(SQ_NPP.NEXTVAL, N'Nhà sách Phương nam', N'272 Lê Thánh Tôn, Phường Bến Nghé, Q1, TPHCM', '0914129286');

INSERT INTO NHAPHANPHOI(MANPP,TENNPP, DIACHI, SDT) VALUES
(SQ_NPP.NEXTVAL, N'Hiệu sách Nhã Nam', N'185 Hoa Lan, Phường 2, Quận Phú Nhuận, TPHCM', '0283847985');

--PHIEUNHAP
INSERT INTO PHIEUNHAPSACH(MAPNS, MANPP, MATK) VALUES
(SQ_PNS.NEXTVAL, 1, 2);

INSERT INTO PHIEUNHAPSACH(MAPNS, MANPP, MATK) VALUES
(SQ_PNS.NEXTVAL, 2, 1);

--CTPN
INSERT INTO CTPNSACH(MAPNS, MASACH, SOLUONGNHAPTUNGCUONSACH, GIASACHNHAP) VALUES(1, 5, 40, 64000);
INSERT INTO CTPNSACH(MAPNS, MASACH, SOLUONGNHAPTUNGCUONSACH, GIASACHNHAP) VALUES(1, 6, 30, 65000);

INSERT INTO CTPNSACH(MAPNS, MASACH,  SOLUONGNHAPTUNGCUONSACH, GIASACHNHAP) VALUES(2, 8, 15, 160000);
INSERT INTO CTPNSACH(MAPNS, MASACH,  SOLUONGNHAPTUNGCUONSACH, GIASACHNHAP) VALUES(2, 9, 15, 110000);

--CHAMCONG
INSERT INTO CHAMCONG(MATK, BATDAULAM, KETTHUC, SOGIOLAM) VALUES (1, '20-05-2023 08:00:00',  '20-05-2023 16:00:00', 8);
INSERT INTO CHAMCONG(MATK, BATDAULAM, KETTHUC, SOGIOLAM) VALUES (2, '20-05-2023 08:00:00',  '20-05-2023 16:00:00', 8);
INSERT INTO CHAMCONG(MATK, BATDAULAM, KETTHUC, SOGIOLAM) VALUES (3, '20-05-2023 08:00:00',  '20-05-2023 16:00:00', 8);
INSERT INTO CHAMCONG(MATK, BATDAULAM, KETTHUC, SOGIOLAM) VALUES (4, '20-05-2023 08:00:00',  '20-05-2023 16:00:00', 8);
INSERT INTO CHAMCONG(MATK, BATDAULAM, KETTHUC, SOGIOLAM) VALUES (5, '20-05-2023 08:00:00',  '20-05-2023 16:00:00', 8);
INSERT INTO CHAMCONG(MATK, BATDAULAM, KETTHUC, SOGIOLAM) VALUES (6, '20-05-2023 08:00:00',  '20-05-2023 16:00:00', 8);

INSERT INTO CHAMCONG(MATK, BATDAULAM, KETTHUC, SOGIOLAM) VALUES (1, '22-05-2023 08:00:00',  '22-05-2023 16:00:00', 8);
INSERT INTO CHAMCONG(MATK, BATDAULAM, KETTHUC, SOGIOLAM) VALUES (2, '22-05-2023 08:00:00',  '22-05-2023 16:00:00', 8);
INSERT INTO CHAMCONG(MATK, BATDAULAM, KETTHUC, SOGIOLAM) VALUES (3, '22-05-2023 08:00:00',  '22-05-2023 16:00:00', 8);
INSERT INTO CHAMCONG(MATK, BATDAULAM, KETTHUC, SOGIOLAM) VALUES (4, '22-05-2023 08:00:00',  '22-05-2023 16:00:00', 8);
INSERT INTO CHAMCONG(MATK, BATDAULAM, KETTHUC, SOGIOLAM) VALUES (5, '22-05-2023 08:00:00',  '22-05-2023 16:00:00', 8);
INSERT INTO CHAMCONG(MATK, BATDAULAM, KETTHUC, SOGIOLAM) VALUES (6, '22-05-2023 08:00:00',  '22-05-2023 16:00:00', 8);

INSERT INTO CHAMCONG(MATK, BATDAULAM, KETTHUC, SOGIOLAM) VALUES (1, '01-06-2023 08:00:00',  '01-06-2023 16:00:00', 8);
INSERT INTO CHAMCONG(MATK, BATDAULAM, KETTHUC, SOGIOLAM) VALUES (2, '01-06-2023 08:00:00',  '01-06-2023 16:00:00', 8);
INSERT INTO CHAMCONG(MATK, BATDAULAM, KETTHUC, SOGIOLAM) VALUES (3, '01-06-2023 08:00:00',  '01-06-2023 16:00:00', 8);
INSERT INTO CHAMCONG(MATK, BATDAULAM, KETTHUC, SOGIOLAM) VALUES (4, '01-06-2023 08:00:00',  '01-06-2023 16:00:00', 8);
INSERT INTO CHAMCONG(MATK, BATDAULAM, KETTHUC, SOGIOLAM) VALUES (5, '01-06-2023 08:00:00',  '01-06-2023 16:00:00', 8);
INSERT INTO CHAMCONG(MATK, BATDAULAM, KETTHUC, SOGIOLAM) VALUES (6, '01-06-2023 08:00:00',  '01-06-2023 16:00:00', 8);

INSERT INTO CHAMCONG(MATK, BATDAULAM, KETTHUC, SOGIOLAM) VALUES (1, '14-06-2023 08:00:00',  '14-06-2023 16:00:00', 8);
INSERT INTO CHAMCONG(MATK, BATDAULAM, KETTHUC, SOGIOLAM) VALUES (2, '14-06-2023 08:00:00',  '14-06-2023 16:00:00', 8);
INSERT INTO CHAMCONG(MATK, BATDAULAM, KETTHUC, SOGIOLAM) VALUES (3, '14-06-2023 08:00:00',  '14-06-2023 16:00:00', 8);
INSERT INTO CHAMCONG(MATK, BATDAULAM, KETTHUC, SOGIOLAM) VALUES (4, '14-06-2023 08:00:00',  '14-06-2023 16:00:00', 8);
INSERT INTO CHAMCONG(MATK, BATDAULAM, KETTHUC, SOGIOLAM) VALUES (5, '14-06-2023 08:00:00',  '14-06-2023 16:00:00', 8);
INSERT INTO CHAMCONG(MATK, BATDAULAM, KETTHUC, SOGIOLAM) VALUES (6, '14-06-2023 08:00:00',  '14-06-2023 16:00:00', 8);

---LUONG
INSERT INTO LUONG(THANG, NAM, MATK) VALUES (5, 2023, 1);
INSERT INTO LUONG(THANG, NAM, MATK) VALUES (5, 2023, 2);
INSERT INTO LUONG(THANG, NAM, MATK) VALUES (5, 2023, 3);
INSERT INTO LUONG(THANG, NAM, MATK) VALUES (5, 2023, 4);
INSERT INTO LUONG(THANG, NAM, MATK) VALUES (5, 2023, 5);
INSERT INTO LUONG(THANG, NAM, MATK) VALUES (5, 2023, 6);

INSERT INTO LUONG(THANG, NAM, MATK) VALUES (6, 2023, 1);
INSERT INTO LUONG(THANG, NAM, MATK) VALUES (6, 2023, 2);
INSERT INTO LUONG(THANG, NAM, MATK) VALUES (6, 2023, 3);
INSERT INTO LUONG(THANG, NAM, MATK) VALUES (6, 2023, 4);
INSERT INTO LUONG(THANG, NAM, MATK) VALUES (6, 2023, 5);
INSERT INTO LUONG(THANG, NAM, MATK) VALUES (6, 2023, 6);

COMMIT;

--DELETE FROM LUONG;
--KET THUC CHAM CONG THI CAP NHAP LUONG
CREATE OR REPLACE TRIGGER TINHLUONGNV
AFTER   UPDATE ON CHAMCONG
FOR EACH ROW
DECLARE 
      gio CHAMCONG.BATDAULAM%TYPE;
      luongnv TAIKHOAN.LUONG%TYPE;
BEGIN
 SELECT SYSDATE INTO gio FROM DUAL;
        SELECT LUONG INTO luongnv
        FROM TAIKHOAN
        WHERE MATK = :NEW.MATK;

        UPDATE LUONG L
        SET L.LUONG = L.LUONG + (:NEW.SOGIOLAM *  luongnv),
        L.SOGIOLAM = L.SOGIOLAM + :NEW.SOGIOLAM
        WHERE  L.MATK = :NEW.MATK
        AND L.NAM = EXTRACT(YEAR FROM gio)
        AND L.THANG = (EXTRACT(MONTH FROM gio));
END;
/
INSERT INTO CHAMCONG(MATK, BATDAULAM, KETTHUC, SOGIOLAM) VALUES (1, '13-06-2023 08:00:00',  '13-06-2023 16:00:00', 8);
INSERT INTO CHAMCONG(MATK, BATDAULAM, KETTHUC, SOGIOLAM) VALUES (2, '13-06-2023 08:00:00',  '13-06-2023 16:00:00', 8);


COMMIT;

