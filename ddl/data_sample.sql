BEGIN;

-- account tableにいれるよ
INSERT INTO accounts
VALUES
 (1,'password','KUDO','09012345678','1660004','杉並区阿佐ヶ谷１丁目','sample@amazon.com','20171008','20171008');

 INSERT INTO  
 item_categories(id, parent_category_id, category_depth, name, created_at,  id_deleted) 
 VALUES
 (1,null, 0,'book','20171008','0'), 
 (2,null, 0,'electronics','20171008','0'), 
 (3,1,1,'book','20171008','0'), 
 (4,1,1,'comic','20171008','0'), 
 (5,2,1,'kitchen','20171008','0'), 
 (6,2,1,'home_Appliances','20171008','1');

 INSERT INTO  
items(id, name, category_id, sale_start,  sale_end, created_at, id_deleted) 
VALUES
 (1,'進撃の巨神(1)', 4, '20171210', null, '20171210', '0'),
 (2,'進撃の巨神(2)', 4, '20171210', null, '20171210', '0'),
 (3,'はじめてのSpringBoot', 3, '20171210', null, '20171210', '0'),
 (4,'Spring徹底入門', 3, '20171210', null, '20171210', '0'),
 (5,'東芝VEGETA', 5, '20171210', null,'20171210', '0'),
 (6,'東芝AW-D836', 6, '20171210', null, '20171210', '0'),
 (7,'東芝サイクロンクリーナー', 6, '20171210', null, '20171210', '1')
 
 COMMIT;