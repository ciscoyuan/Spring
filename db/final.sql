/*
SQLyog Ultimate v12.08 (64 bit)
MySQL - 5.6.24 : Database - final
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`final` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `final`;

/*Table structure for table `acc_base` */

DROP TABLE IF EXISTS `acc_base`;

CREATE TABLE `acc_base` (
  `account_id` bigint(20) NOT NULL COMMENT '账户id',
  `type` tinyint(4) NOT NULL COMMENT '(1:加钱 2:扣钱)',
  `price` bigint(20) NOT NULL COMMENT '金额',
  `create_name` varchar(20) NOT NULL COMMENT '创建人名称',
  `create_code` varchar(20) NOT NULL COMMENT '创建人编码',
  `create_date` datetime NOT NULL COMMENT '创建日期',
  `update_name` varchar(20) DEFAULT NULL COMMENT '更新人名称',
  `update_code` varchar(20) DEFAULT NULL COMMENT '更新人编号',
  `update_date` datetime DEFAULT NULL COMMENT '更新日期',
  `status` tinyint(4) NOT NULL COMMENT '(1:在用2:强制封停3:冻结4:注销)',
  PRIMARY KEY (`account_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='账户基础信息表';

/*Data for the table `acc_base` */

/*Table structure for table `acc_fee` */

DROP TABLE IF EXISTS `acc_fee`;

CREATE TABLE `acc_fee` (
  `fee_id` bigint(20) NOT NULL COMMENT '主键id',
  `account_id` bigint(20) NOT NULL COMMENT '账户id',
  `total_money` bigint(20) NOT NULL COMMENT '总金额',
  PRIMARY KEY (`fee_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='账户余额表';

/*Data for the table `acc_fee` */

/*Table structure for table `acc_log` */

DROP TABLE IF EXISTS `acc_log`;

CREATE TABLE `acc_log` (
  `log_id` bigint(20) NOT NULL COMMENT '主键id',
  `account_id` bigint(20) NOT NULL COMMENT '账户id',
  `type` tinyint(4) NOT NULL COMMENT '(1:加钱 2:减钱)',
  `price` bigint(20) NOT NULL COMMENT '金额',
  `create_name` varchar(20) NOT NULL COMMENT '创建人名称',
  `create_code` varchar(20) NOT NULL COMMENT '创建人编码',
  `create_date` datetime NOT NULL COMMENT '创建日期',
  `update_name` varchar(20) DEFAULT NULL COMMENT '更新人名称',
  `update_code` varchar(20) DEFAULT NULL COMMENT '更新人编号',
  `update_date` datetime DEFAULT NULL COMMENT '更新日期',
  PRIMARY KEY (`log_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='账户变动日志表';

/*Data for the table `acc_log` */

/*Table structure for table `bank_base` */

DROP TABLE IF EXISTS `bank_base`;

CREATE TABLE `bank_base` (
  `bank_id` bigint(20) NOT NULL COMMENT '银行id',
  `bank_name` varchar(20) NOT NULL COMMENT '银行名称',
  `bank_type` tinyint(4) NOT NULL COMMENT '银行类型(1:民安市场通 2:平安专线)',
  `bank_rate` double NOT NULL COMMENT '交易利率',
  `create_name` varchar(20) NOT NULL COMMENT '创建人名称',
  `create_code` varchar(20) NOT NULL COMMENT '创建人编码',
  `create_date` datetime NOT NULL COMMENT '创建日期',
  `update_name` varchar(20) DEFAULT NULL COMMENT '更新人名称',
  `update_code` varchar(20) DEFAULT NULL COMMENT '更新人编号',
  `update_date` datetime DEFAULT NULL COMMENT '更新日期',
  `status` tinyint(4) NOT NULL COMMENT '(1:生效 0:失效)',
  PRIMARY KEY (`bank_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='银行基础信息表';

/*Data for the table `bank_base` */

/*Table structure for table `bank_cmbc` */

DROP TABLE IF EXISTS `bank_cmbc`;

CREATE TABLE `bank_cmbc` (
  `cmbc_id` bigint(20) NOT NULL COMMENT '主键id',
  `bank_id` bigint(20) NOT NULL COMMENT '银行编号',
  `bank_name` varchar(20) NOT NULL COMMENT '开户行',
  `bank_card` varchar(20) NOT NULL COMMENT '银行卡号',
  `charge_no` varchar(50) NOT NULL COMMENT '缴费编号',
  `protocal_no` varchar(50) NOT NULL COMMENT '协议编号',
  `bank_branch` varchar(30) NOT NULL COMMENT '开户支行',
  `create_name` varchar(20) NOT NULL COMMENT '创建人名称',
  `create_code` varchar(20) NOT NULL COMMENT '创建人编码',
  `create_date` datetime NOT NULL COMMENT '创建日期',
  `update_name` varchar(20) DEFAULT NULL COMMENT '更新人名称',
  `update_code` varchar(20) DEFAULT NULL COMMENT '更新人编号',
  `update_date` datetime DEFAULT NULL COMMENT '更新日期',
  `status` tinyint(4) NOT NULL COMMENT '(1:生效 0:失效)',
  PRIMARY KEY (`cmbc_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='民生银行专表';

/*Data for the table `bank_cmbc` */

/*Table structure for table `bank_icbc` */

DROP TABLE IF EXISTS `bank_icbc`;

CREATE TABLE `bank_icbc` (
  `bank_id` bigint(20) NOT NULL COMMENT '银行编号',
  `bank_name` varchar(20) NOT NULL COMMENT '开户行',
  `bank_card` varchar(20) NOT NULL COMMENT '银行卡号',
  `accredit_name` varchar(20) NOT NULL COMMENT '授权人姓名',
  `accredit_card_type` tinyint(4) NOT NULL COMMENT '授权代理人证件类型',
  `accredit_card_number` varchar(20) NOT NULL COMMENT '授权代理人证件号',
  `mobile` bigint(20) NOT NULL COMMENT '移动号',
  `create_name` varchar(20) NOT NULL COMMENT '创建人名称',
  `create_code` varchar(20) NOT NULL COMMENT '创建人编码',
  `create_date` datetime NOT NULL COMMENT '创建日期',
  `update_name` varchar(20) DEFAULT NULL COMMENT '更新人名称',
  `update_code` varchar(20) DEFAULT NULL COMMENT '更新人编号',
  `update_date` datetime DEFAULT NULL COMMENT '更新日期',
  `status` tinyint(4) NOT NULL COMMENT '(1:生效 0:失效)',
  PRIMARY KEY (`bank_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='平安银行专表';

/*Data for the table `bank_icbc` */

/*Table structure for table `goods_base` */

DROP TABLE IF EXISTS `goods_base`;

CREATE TABLE `goods_base` (
  `goods_id` bigint(20) NOT NULL COMMENT '商品唯一标识',
  `goods_name` varchar(20) NOT NULL COMMENT '商品名称',
  `goods_groupId` bigint(20) NOT NULL COMMENT '商品组id',
  `start_price` bigint(20) NOT NULL COMMENT '初始价格',
  `create_name` varchar(20) NOT NULL COMMENT '创建人名称',
  `create_code` varchar(20) NOT NULL COMMENT '创建人编码',
  `create_date` datetime NOT NULL COMMENT '创建日期',
  `update_name` varchar(20) DEFAULT NULL COMMENT '更新人名称',
  `update_code` varchar(20) DEFAULT NULL COMMENT '更新人编号',
  `update_date` datetime DEFAULT NULL COMMENT '更新日期',
  `status` tinyint(4) NOT NULL COMMENT '(1:上架2:下架0:新建)',
  PRIMARY KEY (`goods_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='商品基础信息表';

/*Data for the table `goods_base` */

/*Table structure for table `goods_group` */

DROP TABLE IF EXISTS `goods_group`;

CREATE TABLE `goods_group` (
  `group_id` bigint(20) NOT NULL COMMENT '商品组id(1:发售商品2:现货商品)',
  `group_name` varchar(50) NOT NULL COMMENT '商品组名称',
  `create_name` varchar(20) NOT NULL COMMENT '创建人名称',
  `create_code` varchar(20) NOT NULL COMMENT '创建人编码',
  `create_date` datetime NOT NULL COMMENT '创建日期',
  `update_name` varchar(20) DEFAULT NULL COMMENT '更新人名称',
  `update_code` varchar(20) DEFAULT NULL COMMENT '更新人编号',
  `update_date` datetime DEFAULT NULL COMMENT '更新日期',
  `status` tinyint(4) NOT NULL COMMENT '状态(1:生效 0:失效)',
  PRIMARY KEY (`group_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='商品组表';

/*Data for the table `goods_group` */

/*Table structure for table `order_base` */

DROP TABLE IF EXISTS `order_base`;

CREATE TABLE `order_base` (
  `order_id` bigint(20) NOT NULL COMMENT '订单id',
  `order_type` tinyint(4) NOT NULL COMMENT '(1:实际2:委托)',
  `action` tinyint(4) NOT NULL COMMENT '(1:买2:卖)',
  `fee_status` tinyint(4) DEFAULT NULL COMMENT '1:成功 0:失败',
  `user_id` bigint(20) NOT NULL COMMENT '用户id',
  `create_name` varchar(20) NOT NULL COMMENT '创建人名称',
  `create_code` varchar(20) NOT NULL COMMENT '创建人编码',
  `create_date` datetime NOT NULL COMMENT '创建日期',
  `update_name` varchar(20) DEFAULT NULL COMMENT '更新人名称',
  `update_code` varchar(20) DEFAULT NULL COMMENT '更新人编号',
  `update_date` datetime DEFAULT NULL COMMENT '更新日期',
  `status` tinyint(4) DEFAULT NULL COMMENT '订单状态(1:成功 0:失败)',
  `error_desc` varchar(50) DEFAULT NULL COMMENT '错误描述',
  PRIMARY KEY (`order_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='订单基础信息表';

/*Data for the table `order_base` */

/*Table structure for table `order_detail` */

DROP TABLE IF EXISTS `order_detail`;

CREATE TABLE `order_detail` (
  `order_id` bigint(20) NOT NULL COMMENT '订单id',
  `goods_id` bigint(20) NOT NULL COMMENT '商品id',
  `goods_name` varchar(20) NOT NULL COMMENT '商品名称',
  `product_price` bigint(20) NOT NULL COMMENT '商品单价',
  `product_count` int(11) NOT NULL COMMENT '商品数量',
  `money` bigint(20) NOT NULL COMMENT '总金额',
  `ratecost` bigint(20) NOT NULL COMMENT '银行手续费',
  PRIMARY KEY (`order_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='订单详情表';

/*Data for the table `order_detail` */

/*Table structure for table `quotation` */

DROP TABLE IF EXISTS `quotation`;

CREATE TABLE `quotation` (
  `quotation_id` bigint(20) NOT NULL COMMENT '行情id',
  `goods_id` bigint(20) NOT NULL COMMENT '商品id',
  `goods_groupId` bigint(20) NOT NULL COMMENT '商品组id(1:发售商品2:现货商品)',
  `quotation_type` tinyint(4) NOT NULL COMMENT '行情类型(1:5分钟线 2:30分钟线 3：日线)',
  PRIMARY KEY (`quotation_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='行情表';

/*Data for the table `quotation` */

/*Table structure for table `quotation_sale_five_minute` */

DROP TABLE IF EXISTS `quotation_sale_five_minute`;

CREATE TABLE `quotation_sale_five_minute` (
  `id` bigint(20) NOT NULL COMMENT '单表主键',
  `goods_id` bigint(20) NOT NULL COMMENT '商品主键',
  `create_date` datetime NOT NULL COMMENT '创建时间',
  `product_price` bigint(20) NOT NULL COMMENT '商品价格',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='在售商品5分钟行情表';

/*Data for the table `quotation_sale_five_minute` */

/*Table structure for table `quotation_sale_half_hour` */

DROP TABLE IF EXISTS `quotation_sale_half_hour`;

CREATE TABLE `quotation_sale_half_hour` (
  `id` bigint(20) NOT NULL COMMENT '单表主键',
  `goods_id` bigint(20) NOT NULL COMMENT '商品主键',
  `create_date` datetime NOT NULL COMMENT '创建时间',
  `product_price` bigint(20) NOT NULL COMMENT '商品价格',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='在售商品半小时行情表';

/*Data for the table `quotation_sale_half_hour` */

/*Table structure for table `quotation_salse_day` */

DROP TABLE IF EXISTS `quotation_salse_day`;

CREATE TABLE `quotation_salse_day` (
  `id` bigint(20) NOT NULL COMMENT '单表主键',
  `goods_id` bigint(20) NOT NULL COMMENT '商品主键',
  `create_date` datetime NOT NULL COMMENT '创建时间',
  `product_price` bigint(20) NOT NULL COMMENT '商品价格',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='在售商品每日行情表';

/*Data for the table `quotation_salse_day` */

/*Table structure for table `quotation_spots_day` */

DROP TABLE IF EXISTS `quotation_spots_day`;

CREATE TABLE `quotation_spots_day` (
  `id` bigint(20) NOT NULL COMMENT '单表主键',
  `goods_id` bigint(20) NOT NULL COMMENT '商品主键',
  `create_date` datetime NOT NULL COMMENT '创建时间',
  `product_price` bigint(20) NOT NULL COMMENT '商品价格',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='现货商品每日行情表';

/*Data for the table `quotation_spots_day` */

/*Table structure for table `quotation_spots_five_minute` */

DROP TABLE IF EXISTS `quotation_spots_five_minute`;

CREATE TABLE `quotation_spots_five_minute` (
  `id` bigint(20) NOT NULL COMMENT '单表主键',
  `goods_id` bigint(20) NOT NULL COMMENT '商品主键',
  `create_date` datetime NOT NULL COMMENT '创建时间',
  `product_price` bigint(20) NOT NULL COMMENT '商品价格',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='现货商品5分钟行情表';

/*Data for the table `quotation_spots_five_minute` */

/*Table structure for table `quotation_spots_half_hour` */

DROP TABLE IF EXISTS `quotation_spots_half_hour`;

CREATE TABLE `quotation_spots_half_hour` (
  `id` bigint(20) NOT NULL COMMENT '单表主键',
  `goods_id` bigint(20) NOT NULL COMMENT '商品主键',
  `create_date` datetime NOT NULL COMMENT '创建时间',
  `product_price` bigint(20) NOT NULL COMMENT '商品价格',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='现货商品半小时行情表';

/*Data for the table `quotation_spots_half_hour` */

/*Table structure for table `sys_user` */

DROP TABLE IF EXISTS `sys_user`;

CREATE TABLE `sys_user` (
  `user_id` bigint(20) NOT NULL COMMENT '用户id',
  `user_code` varchar(20) NOT NULL COMMENT '用户账号',
  `user_name` varchar(20) NOT NULL COMMENT '用户昵称',
  `user_type` tinyint(4) NOT NULL COMMENT '用户类型',
  `mobile` varchar(20) NOT NULL COMMENT '手机号',
  `password` varchar(50) NOT NULL COMMENT '登录密码',
  `account_id` bigint(20) NOT NULL COMMENT '账户id',
  `create_name` varchar(20) NOT NULL COMMENT '创建人名称',
  `create_code` varchar(20) NOT NULL COMMENT '创建人编码',
  `create_date` datetime NOT NULL COMMENT '创建日期',
  `update_name` varchar(20) DEFAULT NULL COMMENT '更新人名称',
  `update_code` varchar(20) DEFAULT NULL COMMENT '更新人编号',
  `update_date` datetime DEFAULT NULL COMMENT '更新日期',
  `status` tinyint(4) NOT NULL COMMENT '(1:在用2:强制封停3:冻结4:注销)',
  PRIMARY KEY (`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='用户表';

/*Data for the table `sys_user` */

/*Table structure for table `user_bank` */

DROP TABLE IF EXISTS `user_bank`;

CREATE TABLE `user_bank` (
  `user_id` bigint(20) NOT NULL COMMENT '用户id',
  `bank_id` bigint(20) NOT NULL COMMENT '银行编号',
  `create_name` varchar(20) NOT NULL COMMENT '创建人名称',
  `create_code` varchar(20) NOT NULL COMMENT '创建人编码',
  `create_date` datetime NOT NULL COMMENT '创建日期',
  `update_name` varchar(20) DEFAULT NULL COMMENT '更新人名称',
  `update_code` varchar(20) DEFAULT NULL COMMENT '更新人编号',
  `update_date` datetime DEFAULT NULL COMMENT '更新日期',
  `status` tinyint(4) NOT NULL COMMENT '单记录状态',
  PRIMARY KEY (`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='用户银行关联表';

/*Data for the table `user_bank` */

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
