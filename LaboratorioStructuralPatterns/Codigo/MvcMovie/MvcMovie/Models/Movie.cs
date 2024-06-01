//using System.ComponentModel.DataAnnotations;

//namespace MvcMovie.Models;

//public class Movie
//{
//    public int Id { get; set; }
//    public string? Title { get; set; }
//    [DataType(DataType.Date)]
//    public DateTime ReleaseDate { get; set; }
//    public string? Genre { get; set; }
//    public decimal Price { get; set; }
//}

using System;
using System.ComponentModel.DataAnnotations;
using System.ComponentModel.DataAnnotations.Schema;

namespace MvcMovie.Models;

public class Movie
{
    public int Id { get; set; }
    public string? Title { get; set; }

    [Display(Name = "Release Date")]
    [DataType(DataType.Date)]
    public DateTime ReleaseDate { get; set; }
    public string? Genre { get; set; }
    [Column(TypeName = "decimal(18, 2)")]
    public decimal Price { get; set; }
}