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

 COMMIT;