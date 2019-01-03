using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.ComponentModel.DataAnnotations;
using System.ComponentModel.DataAnnotations.Schema;

namespace Epione.Domain.Entities
{
    public class Appointment
    {
        public int AppointmentId { get; set; }

        [Display(Name = "The time : ")]
        [Required(ErrorMessage = "The time is obligatory")]
        [DataType(DataType.Time)]
        [DisplayFormat(ApplyFormatInEditMode = true, DataFormatString = "{0:H:mm}")]
        public DateTime time { get; set; }

        [Display(Name = "The date : ")]
        [Required(ErrorMessage = "The date is obligatory")]
        [DisplayFormat(DataFormatString = "{0:dd/MM/yyyy}")]
        //[DataType(DataType.Date)]
        public DateTime date { get; set; }

        [Display(Name = "The object : ")]
        [Required(ErrorMessage = "The object is obligatory")]
        public string objectAppointment { get; set; }

        [Display(Name = "The message : ")]
        [MaxLength(50, ErrorMessage = "The message is too long")]
        public string message { get; set; }
        public int statut { get; set; }
        public string PatFK { get; set; }

        [ForeignKey("PatFK")]
        public virtual Patient patient { get; set; }

        public string DocFK { get; set; }

        [ForeignKey("DocFK")]
        public virtual Doctor doctor { get; set; }


    }
    /* public enum objectAppointment
      {
          Certificat ,
          Vaccination ,
          Controle ,
          Urgence

      }*/
}
