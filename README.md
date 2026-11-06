# Lab 1 – Review OOP

MOB1024 Lập trình Java 2. Làm theo **đề Lab 1** giảng viên phát.

Repo này là **khung bài làm**: đã có sẵn package và file cho từng bài, mỗi file chỉ có khai báo class và danh sách `TODO`. Bạn tự viết toàn bộ thuộc tính, constructor và phương thức.

## Cấu trúc
Tổ chức giống code demo **CineJava**: mỗi bài tách `model` / `service` / `Main`.
```
src/lab1/
├── bai1/                        ← Bài 1 (3đ)
│   ├── Main.java                ← chỉ gọi service và in kết quả
│   ├── model/
│   │   ├── Product.java         ← dữ liệu + kiểm tra + finalPrice()
│   │   └── ImportedProduct.java ← extends Product
│   └── service/
│       └── ProductService.java  ← tạo danh sách mẫu, in danh sách, tìm sản phẩm đắt nhất
├── bai2/                        ← Bài 2 (3đ)
│   ├── Main.java
│   ├── model/
│   │   ├── Employee.java
│   │   ├── FullTimeEmployee.java
│   │   └── PartTimeEmployee.java
│   └── service/
│       └── EmployeeService.java ← tạo danh sách mẫu, in danh sách, tìm người thu nhập cao nhất
├── bai3/  Main.java             ← Bài 3 (2đ): AI sinh dữ liệu mẫu có lỗi
└── bai4/  Main.java             ← Bài 4 (2đ): AI ra bài tương tự, tự làm, AI chấm
anh-chup/                        ← ảnh chụp màn hình quá trình dùng AI (Bài 3, 4)
```
Phân vai: **model** không in, không nhập – chỉ giữ dữ liệu và tính toán; **service** xử lý cả danh sách; **Main** chỉ gọi service.

**Không đổi tên package, class, file đã có.** Bài 4 được thêm file mới trong `src/lab1/bai4/`.

## Bắt đầu
**Yêu cầu:** JDK 17 trở lên, VS Code + *Extension Pack for Java*, Git.

1. Nhận bài qua link Classroom50 → GitHub tạo cho bạn một repo riêng.
2. Clone repo đó về thư mục **không dấu, không khoảng trắng** (vd `D:\MOB1024\`):
   ```bash
   git clone <link repo của bạn>
   ```
3. VS Code: **File → Open Folder…** → chọn thư mục repo vừa clone (thư mục có `src/` ngay bên trong).
4. Mở `Main.java` của từng bài → bấm **Run**.

## Nộp bài
Làm xong mỗi bài thì commit và push:
```bash
git add .
git commit -m "Bai 1: Product, ImportedProduct"
git push
```
Nộp nhiều lần được. Giảng viên chấm bản push cuối cùng trước hạn.
Ảnh chụp màn hình Bài 3, 4 bỏ vào `anh-chup/` rồi commit cùng code.

## Chấm điểm
- **Bài 1, Bài 2 (6đ) chấm tự động** mỗi lần bạn push. Xem kết quả ở tab **Actions** / **Releases** của repo.
- **Bài 3, Bài 4 (4đ)** giảng viên chấm tay theo code + ảnh trong `anh-chup/`.

Để được chấm tự động, cần đúng các quy ước ghi trong `TODO` của từng file:
- Đúng tên lớp, tên thuộc tính, kiểu dữ liệu (`double` cho giá, lương, giờ làm…), thuộc tính là `private`.
- Getter/setter đặt tên chuẩn: `getId()`, `setBasePrice(double)`, `getBonus()`…
- Lớp service có đủ 3 phương thức `public static` đúng tên ghi trong `TODO`.
- Constructor đúng thứ tự tham số như trong `TODO`.
- Dữ liệu sai (id rỗng, giá âm, thuế ngoài 0–1…) thì ném **`IllegalArgumentException`** – ở cả setter lẫn constructor. Thông báo lỗi tự viết.
- `Main` của Bài 1, Bài 2 **tạo dữ liệu sẵn trong code**, không dùng `Scanner` chờ nhập.

## Lưu ý
- Code phải **biên dịch được**. Bài chưa làm xong thì để nguyên khung, đừng để lỗi cú pháp – lỗi biên dịch là mọi tiêu chí đều 0 điểm.
- `basePrice` là `private` của lớp cha → trong lớp con đọc qua getter.
- Lớp ở package khác phải `import` (vd `Main` dùng `import lab1.bai1.model.Product;`), và class, constructor, phương thức dùng chéo package phải là `public`.
- Danh sách khai báo kiểu lớp cha (`List<Product>`) chứa được cả đối tượng lớp con – đó là đa hình.
- Lỗi `ClassNotFoundException` khi chạy: thường do mở sai thư mục trong VS Code hoặc đường dẫn có dấu tiếng Việt.
