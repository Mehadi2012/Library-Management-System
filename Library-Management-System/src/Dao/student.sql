SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";

-- Database: `test`

-- Table structure for table `librarian`

CREATE TABLE IF NOT EXISTS `student` (
`studentid` int(5) NOT NULL AUTO_INCREMENT,
`studentname` varchar(100) NOT NULL,
`email` varchar(100) NOT NULL,
`studentcontact` varchar(20) NOT NULL,
`fine` boolean NOT null ,
PRIMARY KEY (`studentid`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;
