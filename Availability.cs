using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.ComponentModel.DataAnnotations;
using System.ComponentModel.DataAnnotations.Schema;

namespace Epione.Domain.Entities
{
    public class Availability
    {
        [Key]
        public int AvailabilityId { get; set; }
        public string Description { get; set; }
        public DateTime Date { get; set; }
        public DateTime StartTime { get; set; }
        public DateTime EndTime { get; set; }
        public string DocFK { get; set; }
        [ForeignKey("DocFK")]
        public virtual Doctor Doctor { get; set; }
    }
}
