import React, { useEffect, useState } from 'react';
import axios from 'axios';
import { Link } from 'react-router-dom';

const HomePage = () => {
  const [titles, setTitles] = useState([]);

  useEffect(() => {
    axios.get('/api/titles')
      .then(response => setTitles(response.data))
      .catch(error => console.error(error));
  }, []);

  return (
    <div>
      <h2>Popular Manga</h2>
      <ul>
        {titles.map(title => (
          <li key={title.titleId}>
            <Link to={`/titles/${title.titleId}`}>{title.name}</Link>
          </li>
        ))}
      </ul>
    </div>
  );
};

export default HomePage;
